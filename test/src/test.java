import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test {
        public static void main (String [] args){
            //字节输入流
            File file = new File("D:\\OneDrive\\桌面\\静夜思.txt");
            FileInputStream fis=null;
            try{
                fis=new FileInputStream(file);
                //System.out.println(fis.available());    //读取文件长度
                //System.out.println(fis.read()); //读取文件并返回读取到的位置，若读完返回-1
                byte []b=new byte[1024]; //创建一个byte数组存放读到的文件
                int len=fis.read(b); //读取一部分内容放进数组
                while(len!=-1){
                    String data=new String(b); //将byte转换成字符串
                    System.out.println(data);
                    len=fis.read(b);
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
}
