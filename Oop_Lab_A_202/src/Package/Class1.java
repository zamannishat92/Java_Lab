package Package;

// public: All access
// Default/no access modifier: Package access
// private: Only own class access

    public class Class1 {
        public int data;

        public void printData(){
            System.out.println(
                    "Value of data is: " + data);
        }

        public Class1(int data){
            this.data = data;
        }
    }


