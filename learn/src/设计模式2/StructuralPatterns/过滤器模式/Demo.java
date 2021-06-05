package 设计模式2.StructuralPatterns.过滤器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/6/4-19:03
 */
public class Demo {
    /*
    * 过滤器模式 Filter Pattern  或者 标准模式（Criteria Pattern）
    *        这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式
    * 把他们连接起来。
    *       结合多个标准来获得单一标准
    * */

    public static void main(String[] args) {
//        使用不同的标准 Criteria 来过滤对象
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));


        Criteria male = new CriteriaMale();
        Criteria single = new CriteriaSingle();
        Criteria singelOrMale = new OrCriteria(male,single);
        System.out.println("-----------------");
        for (Person item : male.meetCriteria(persons)) {
            System.out.println(item);
        }
        System.out.println("-----------------");
        for (Person item : single.meetCriteria(persons)) {
            System.out.println(item);
        }
        System.out.println("-----------------");

// meet  遇见，满足，对付
        List<Person> p = singelOrMale.meetCriteria(persons);
        for (Person person : p) {
            System.out.println(person);
        }


    }

}

// 创建一个类，在该类上应用标准
class Person {
    private String name;
    private String gender;
    private String maritalStatus; // marital 婚姻的

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}

// 为标准 （Criteria） 创建一个接口
interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);  // meet 满足
}

// 创建 Criteria  的实体类
class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("male")) {
                malePerson.add(person);
            }
        }
        return malePerson;
    }
}

class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePerson = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("female")) {
                femalePerson.add(person);
            }
        }
        return femalePerson;
    }
}

class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personFileter = new ArrayList<>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("single")) {
                personFileter.add(person);
            }
        }
        return personFileter;
    }
}

//   两个筛选条件
class AndCriteria implements  Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
//  满足其中一个就行
class OrCriteria implements  Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        for (Person otherPerson : otherCriteriaPersons) {
            if(!firstCriteriaPersons.contains(otherPerson)) {// 重写 equals .. 这里不用重写equals 去比较，，因为操作的是同一个List集合
                firstCriteriaPersons.add(otherPerson);
            }
        }
        return  firstCriteriaPersons;
    }
}