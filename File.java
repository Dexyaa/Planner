import java.io.*;
public class File{

    File(){
        
    }

    public void reader(String path){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            // Exception handling
            System.out.println("File: " + path + " was not found.");
        } catch (IOException e) {
            // Exception handling
            e.printStackTrace();
        }
    }

    public void writer(String path, String input){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(input);
        } catch (IOException e) {
            e.printStackTrace();
            // Exception handling
        }
    }
}
