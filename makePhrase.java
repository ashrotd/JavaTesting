public class makePhrase {
    public static void main(String[] args){
        String[] list1 = {"agnostic", "opinionated",
        "voice activated", "haptically driven", "extensible",
        "reactive", "agent based", "functional", "AI enabled",
        "strongly typed"};
        String[] list2 = {"loosely coupled", "six sigma",
        "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};
        String[] list3 = {"framework", "library",
        "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
        "orientation"};

        int len1 = list1.length;
        int len2 = list2.length;
        int len3 = list3.length;

        // Create a random generator
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(len1);
        int rand2 = randomGenerator.nextInt(len2);
        int rand3 = randomGenerator.nextInt(len3);

        // Now build a phrase with random values
        String phrase = list1[rand1]+" "+list2[rand2]+" "+list3[rand3];

        // Print out the phrase
        System.out.println("This is a generated phrase\n"+ phrase);
    }
}
