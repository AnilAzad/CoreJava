package test;
public class BookDetails {
    public String name,author;
    public float price;
    public int qty;
    public BookDetails(String name, String author,float price, int qty){
        
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String toString(){
        return name+"\t"+author+"\t"+price+"\t"+qty;
    }
    
}