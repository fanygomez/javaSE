package p6;
class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException {}
public class App  {
    public static void main(String[] args) {
        App obj = new App();

        try{
            obj.open();
            obj.process();
        }catch (Exception e){
            System.out.println("Completed");
        }
    }

    private void process() throws LogFileException {
        System.out.println("Process.");
        throw new LogFileException();
    }
    private void open() {
        System.out.println("Open.");
        throw new AccessViolationException();
    }
}
