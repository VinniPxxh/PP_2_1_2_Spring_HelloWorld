import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        boolean comparisonSimpleBean = bean == bean2;
        boolean comparisonCatBean = catBean == catBean2;
        System.out.println(comparisonSimpleBean + "\n" + comparisonCatBean);

        System.out.println(bean.getMessage());
        System.out.println((catBean.getMessage()));
    }
}