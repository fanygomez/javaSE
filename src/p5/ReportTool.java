package p5;

public class ReportTool extends Tool{
    public void export(){//lne2
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        System.out.println("#146");
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex){
        ex.export();
    }
}
