
public class Product {

    
    private final int IDProduct;
    private final String NameModel;
    private final String color;
    private final int talle;
    private final int cantidad;
    private final float precio;
    
    public Product(int IDProduct,String NameModel, String color,int talle, int cantidad, float precio ){
        this.IDProduct= IDProduct;
        this.NameModel=NameModel;
        this.color= color;
        this.talle=talle;
        this.cantidad=cantidad;
        this.precio=(cantidad*precio);
        
    }

    
    
    public static class builder {
        private int IDProduct;
        private String NameModel;
        private String color;
        private int talle;
        private int cantidad;
        private float precio;
        
        public int getIdProduct(){
            return IDProduct;
        }
        public String getNameModel(){
           return NameModel;
        }
        public String getColor(){
            return color;
        }
        public int getTalle(){
            return talle;
        }
        public int getCantidad(){
            return cantidad;
        }
        public float getPrecio(){
            return precio;
        }
        
        public builder setIdProduct(int IDProduct){
            this.IDProduct=IDProduct;
            return this;
        }
        public builder setNameModel(String NameModel){
            this.NameModel=NameModel;
            return this;
        }
        public builder setColor(String color){
            this.color=color;
            return this;
        }
        public builder setTalle(int talle){
            this.talle=talle;
            return this;
        }
        public builder setCantidad(int cantidad){
            this.cantidad=cantidad;
            return this;
        }
        public builder setPrecio(int precio){
            this.precio=cantidad*precio;
            return this;
        }
        
        private Product build(){
            return new Product(IDProduct, NameModel,color,talle,cantidad,precio);
        }  
        
            
        }
    } 



