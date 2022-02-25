package co.com.prueba.rT.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage1 {
    public static final Target FIRSTNAME = Target.the("Box").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Box").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Box").located(By.id("email"));
    public static final Target MONTH = Target.the("List").located(By.xpath("//div[@placeholder='Month']//i[@class='caret pull-right']"));
    public static final Target LISTMONTH = Target.the("List").located(By.xpath("//*[@id=\"birthMonth\"]/input[1]"));
    public static final Target DAY = Target.the("List").located(By.xpath("//div[@placeholder='Day']//i[@class='caret pull-right']"));
    public static final Target LISTDAY = Target.the("List").located(By.xpath("//*[@id=\"birthDay\"]/input[1]"));
    public static final Target YEAR = Target.the("List").located(By.xpath("//div[@placeholder='Year']//i[@class='caret pull-right']"));
    public static final Target LISTYEAR = Target.the("List").located(By.xpath("//*[@id=\"birthYear\"]/input[1]"));
    public static final Target GENDER = Target.the("List").located(By.xpath("//*[@id=\"genderCode\"]/div[1]/span/i"));
    public static final Target LISTGENDER = Target.the("List").located(By.xpath("//*[@id=\"genderCode\"]/input[1]"));
    public static final Target BTNNEXT = Target.the("boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
