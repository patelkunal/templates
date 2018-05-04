import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainApp {
    public static void main(String[] args) {
        final String helpMessage = String.format("%s\n\t%s\n\t%s",
            "usage:",
            "gradle run -PmainClass=package.Main",
            "gradle run -PmainClass=package.Main -Dexec.args=\"arg1 arg2 arg3 1 2 3\""
        );
        System.out.println(helpMessage);
    }
}
