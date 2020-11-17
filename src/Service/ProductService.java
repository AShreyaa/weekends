package Service;

import java.util.ArrayList;

import bean.Product;

public class ProductService {
	
//	Product[] products=new Product[10];
ArrayList<Product> prodArrayList=new ArrayList<>();
int i;
	
	
	
	public void addProduct(int id,int price, String name){
		Product p1=new Product();
		p1.setId(id);
		p1.setName(name);
		p1.setPrice(price);
		
//		Product p2=new Product(id,price,name);
		
//		products[i]=p2;
//		i++;
		prodArrayList.add(p1);
		
		
	}
//	 public void addProduct(Product p) {
//		 
//	 }
	
	
public boolean deleteProduct(int id){
	int index;

	
	for(int i=0;i<prodArrayList.size();i++) {
		
		// prodArray[i]... return a product obj at index i
		// prodArrayList.get(i).... return a product obj at index i
		
		if(id==prodArrayList.get(i).getId()) {
			prodArrayList.remove(i);
			//prodArrayList.remove(prodArrayList.get(i));
			return true;
			//break;
		}
		
	}
	
	for(Product p:prodArrayList) {
		if(id==p.getId()) {
			prodArrayList.remove(p);
			return true;
			//break;
		}
	}
	 return false;
	
	
}
	

//public Product deleteProduct(){
//	
//}

public boolean updateProduct(int id, int price){
	
for(int i=0;i<prodArrayList.size();i++) {
		
		if(id==prodArrayList.get(i).getId()) {
			Product p=new Product();
			p=prodArrayList.get(i);
			p.setPrice(price);
			
			prodArrayList.set(i, p);
//			prodArrayList.get(i).setPrice(price);
//			
//			prodArrayList.set(i,prodArrayList.get(i));
			
			return true;
			//break;
		}
		
	}
return false;
	
}
	

public ArrayList<Product> getAllProducts(){
	
	return prodArrayList;
	
}
public int getPrice(int id){
	
	for(Product p:prodArrayList) {
		if(id==p.getId()) {
			return p.getPrice();
			//break;
		}
	
}
	return -1;	


}


}