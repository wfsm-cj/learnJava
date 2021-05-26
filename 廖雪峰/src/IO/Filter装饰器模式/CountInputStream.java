package IO.Filter装饰器模式;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * @author chenjie
 * @date 2021/5/24-21:45
 */
public class CountInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected CountInputStream(InputStream in) {
        super(in);
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] data = "hello world".getBytes("UTF-8");

    }
}
