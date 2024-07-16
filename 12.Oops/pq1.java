public class pq1{
    public static class complex{
        int real;
        int img;
        public complex(int real,int img){
            this.real = real;
            this.img = img;
        }

        void add(complex obj,complex obj1){
            int img1 = obj.img+obj1.img;
            int real1  = obj.real + obj1.real;
            System.out.println(real1+" + "+"i"+img1);
        }
        void diff(complex obj,complex obj1){
            int img1 = obj.img-obj1.img;
            int real1  = obj.real - obj1.real;
            System.out.println(real1+"+"+"i"+img1);
        }
        void product(complex obj, complex obj1) {
            int real1 = obj.real * obj1.real - obj.img * obj1.img;
            int img1 = obj.real * obj1.img + obj.img * obj1.real;
            System.out.println(real1 + " + " + "i" + img1);
        }
        
    }
    public static void main(String[] args) {
        complex obj = new complex(2, 12);
        complex obj1 = new complex(2, 4);
        complex obj3 = new complex(0, 0);
        obj3.add(obj, obj1);
        obj3.diff(obj, obj1);
        obj3.product(obj, obj1);
       

    }
}
