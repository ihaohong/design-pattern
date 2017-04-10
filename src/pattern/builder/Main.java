package pattern.builder;

public class Main {
    public static void main(String[] args) {
//        if (args.length != 1) {
//            usage();;
//            System.exit(0);
//        }
        String mode = "plain";

        if (mode.equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (mode.equals("html")) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "文件编写完成");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main plain 编写纯文本文档");
        System.out.println("Usage: java Main html  编写html文档");
    }
}