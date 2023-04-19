

public class Runner {

    public static void main(String[] args) throws Exception {
       
        ReadAsCharacterStream.Read(); 
        ReadAsByteStream.Read(); 


        WriteAsCharacterStream.Write(); 
        WriteAsByteStream.Write();

        CounterToFile.startCounter();
        

    }

}