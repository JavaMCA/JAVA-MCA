import java.util.Arrays;
class BuiltInPackageCount{
    public static void main(String[] args) {
        Package[] builtInPackages= Package.getPackages();
        System.out.println("Total package="+builtInPackages.length);
        System.out.println("Builtin Package =");
        Arrays.stream(builtInPackages).forEach(pkg->System.out.println(pkg.getName()));


    }
}