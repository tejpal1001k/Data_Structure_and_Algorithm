public class EncapsulationMain {

        public static void main(String[] args) {
            EncapsulationExample example = new EncapsulationExample();
            example.setId(1);
            example.setName("John Doe");

            System.out.println("ID: " + example.getId());
            System.out.println("Name: " + example.getName());
        }

}
