package org.example;

public class MakerClass {
    public static void main(String[] args) {
        String package_name = "package org.example";
        String line_space = "" +
                "\n";
        String class_name = "public class Student ";
        String start_curl = "{";
        String [] properties = new String[]{"    private|String|name;","    private|String|surname;"};
        String end_curl = "}";

        StringBuffer result = new StringBuffer();
        result.append(package_name);
        result.append(line_space);
        result.append(class_name);
        result.append(start_curl);
        for (String prop : properties) {
            result.append(line_space);
            result.append(prop.replace("|"," "));
        }
        result.append(line_space);
        result.append(end_curl);
        System.out.println(result);

    }
}
