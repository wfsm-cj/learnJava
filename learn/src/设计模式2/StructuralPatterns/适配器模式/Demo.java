package 设计模式2.StructuralPatterns.适配器模式;

import java.util.Iterator;

/**
 * @author chenjie
 * @date 2021/6/4-10:46
 */
public class Demo {
    /*
    * 适配器模式 （Adapter Pattern）
    *       作为两个不兼容的接口之间的桥梁，。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能
    * 意图：
    *      将一个类的接口转换成客户希望的另外一个接口，适配器模式使用原本由于接口把不兼容而不能一起工作的那些类可以一起工作
    * 关键代码：
    *       适配器继承或依赖已有的对象，实现想要的目标接口
    * 应用实例：
    *       1，美国电器 110V ，中国 220V ，就要有一个适配器，将 110V 转化为 220V
    *       2， JAVA JDK1.1 提供了 Enumeration接口， 而在1.2中 提供了 Iterator接口，想要使用 1.2的JDK，则要将以前系统的 Enumeration
    * 接口转换为Iterator 接口，这时就需要适配器模式
    *       3， JAVA中的jdbc
    *
    * 优点：
    *       1，可以让任何两个没有关联的类一起运行
    *       2，提高了类的复用
    *       3，增加了类的透明度
    *       4，灵活性好
    * 缺点：
    *       1，过多的使用适配器，会让系统非常零乱，不易整体进行把握，比如：明明看到调用的是 A接口
    * 其实内部被适配器成了 B接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。
    *       因此，如果不是很有必要，可以不适用适配器，而是直接对系统进行重构
    *       2，由于Java至多继承一个类，所以至多只能适配一个适配者类。。而且目标类必须是抽象类
    *
    * 使用场景：
    *       有动机的修改一个正常运行的系统的接口，这时候应该考虑使用适配器模式
    * 注意事项：
    *       适配器不是在详细设计时添加的，而是解决正在服役的项目的问题
    * */
    public static void main(String[] args) {
//        使用 最终实现类 AudioPlayer 来播放不同类型的音频格式
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","123.mp3");
        audioPlayer.play("mp4","xxx.mp4");
        audioPlayer.play("vlc","xxx.vlc");
        audioPlayer.play("avi","xxx.avi");
    }
}

// 为媒体播放器和更高级的媒体播放器创建接口
interface MediaPlayer {
    public void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}

//创建实现了 AdvancedMediaPlayer  接口的实体类
class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file name  :" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file.name : "+ fileName);
    }
}


// 创建实现了 MediaPlayer 接口的适配器类
class MediaAdapter implements MediaPlayer {
//    适配器，将你想要融合的接口的 实现出来，给一个实体类对象上。。
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }


    }
}

// 创建实现了 MediaPlayer 接口的实体类
class AudioPlayer implements MediaPlayer {
//    你最终的实体类，就会实现 适配器中实现的实体类  和 你自己需要补充实现的东西
    MediaAdapter  mediaAdapter; // 把适配器传入实体类

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file name : " + fileName); // 加入自己的
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media" + audioType +" format not supported");
        }


    }
}