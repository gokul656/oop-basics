public class ConstOverloading {
    public static void main(String[] args) {
        ContructorOverLoading load_one = new ContructorOverLoading();
        ContructorOverLoading load_two = new ContructorOverLoading("Some", "Data");
        ContructorOverLoading load_three = new ContructorOverLoading("Some", "Another", "Data");
    }
}


class ContructorOverLoading{

    String data1;
    String data2;
    String data3;

    ContructorOverLoading(){

    }

    ContructorOverLoading(String data1, String data2){

    }

    ContructorOverLoading(String data1, String data2, String data3){

    }
}