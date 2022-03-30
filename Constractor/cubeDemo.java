class cube {
    int height, width, lenght;
    
    cube() {
        height = 10;
        width = 10;
        lenght = 10;
    }

    cube(int x, int y, int z) {
        height = x;
        width = y;
        lenght = z;
    }

    int getArea() {
        return height * width * lenght;
    }
}


class cubeDemo {
    public static void main(String args[]) {
        cube c1 = new  cube();
        int a = c1.getArea();
        System.out.println("Area = " +a);
        // System.out.println("Area = " +c1.getArea());

        cube c2 = new cube(50, 10, 20);
        System.out.println("Area = " +c2.getArea());
    
    }
}