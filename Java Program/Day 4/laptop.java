class DefineAsItsReady {
    private int model;
    private String name;
    
    public int getModel(){
        return this.model;
    }
    public String getName(){
        return this.name;
    }
    public void setModel(int model){
        this.model = model;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class laptop{
    public static void main(String[] args) {
        DefineAsItsReady tp = new DefineAsItsReady();
        tp.setModel(00226712);
        tp.setName("Thinkpad t14 gen1");

        System.out.println("Details");
        System.out.println("Name :" + tp.getName());
        System.out.println("Model :" +tp.getModel());
    }
}