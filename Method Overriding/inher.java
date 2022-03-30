class first {
    first() {
        System.out.println("Super class constructor");
    }
}

class second extends first {
    second() {
        System.out.println("Child class constructor");
    }
}

class third extends second {
    third() {
        System.out.println("sub-child class constructor");
    }
}

class inher {
    public static void main(String[] args) {
        third t1 = new third();
    }
}