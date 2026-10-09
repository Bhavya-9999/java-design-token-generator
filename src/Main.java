import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> tokens = new LinkedHashMap<>();
        tokens.put("brand-primary", "#3157D5");
        tokens.put("brand-secondary", "#6D28D9");
        tokens.put("surface", "#FFFFFF");
        tokens.put("text-primary", "#1F2937");
        tokens.put("spacing-small", "8px");
        tokens.put("spacing-medium", "16px");
        tokens.put("radius-card", "12px");

        System.out.println("=== Design Token Generator ===");
        System.out.println(":root {");
        tokens.forEach((name, value) ->
                System.out.printf("  --%s: %s;%n", name, value));
        System.out.println("}");

        System.out.println();
        System.out.println("Suggested component rule:");
        System.out.println("card -> spacing-medium + radius-card + surface + text-primary");
    }
}
