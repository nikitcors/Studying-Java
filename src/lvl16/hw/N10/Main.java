package lvl16.hw.N10;


import java.io.*;

public class Main {
    static BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
    static String firstFileName = "";
    static String secondFileName = "";
    static {
        try {
            firstFileName = inStr.readLine();
            secondFileName= inStr.readLine();
            inStr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }
    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());

    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String filename = "";

        public String getFileBody() {
            return fileBody;
        }

        public void setFileBody(String fileBody) {
            this.fileBody = fileBody;
        }

        String fileBody = "";
        @Override
        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        @Override
        public String getFileContent() {
            if (!fileBody.isEmpty()) return fileBody;
            String resultStr = "";
            File file = new File(filename);
            if (file.canRead()){
                try {
                    FileReader fileReader = new FileReader(file);
                    char [] a = new char[(int)(file.length())];   // Количество символов, которое будем считывать
                    fileReader.read(a);
                    fileReader.close();
                    for(char c : a)
                        if(c != '\n') {
                            resultStr += c;
                        } else {
                            resultStr += " ";
                        }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            return resultStr;
        }

        @Override
        public void run() {
            fileBody = getFileContent();
        }
    }
}
