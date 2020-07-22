package app;

public enum MyEnum {
    PLUS {
        @Override
        public void apply(int a, int b) {
            System.out.println(a + b);
        }
    },
    MINUS {
        @Override
        public void apply(int a, int b) {
            System.out.println(a - b);
        }
    },
    TIMES {
        @Override
        public void apply(int a, int b) {
            System.out.println(a * b);
        }
    },
    DIVIDE {
        @Override
        public void apply(int a, int b) {
            System.out.println(a / b);
        }

    };

    public abstract void apply(int a, int b);

}