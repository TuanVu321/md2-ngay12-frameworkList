import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> arr = new ArrayList<>();
    public void add(Product product){
        arr.add(product);
    }
    public void modify(int id, int newID, String newName){
        arr.get(id).setId(newID);
        arr.get(id).setName(newName);
    }
    public void delete(int id){
        arr.remove(id);
    }
    public void display(int id){
        System.out.println(arr.get(id).getId()+":"+arr.get(id).getName());
    }
    public void find(int id){
        for(int i=0;i<arr.size();i++){
            if(id==arr.get(i).getId()){
                System.out.println(arr.get(i).getId()+":"+arr.get(i).getName());
                break;
            }else{
                System.out.println("Khong tim thay");
            }

        }
    }

}
