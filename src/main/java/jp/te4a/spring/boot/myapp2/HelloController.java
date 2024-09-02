package jp.te4a.spring.boot.myapp2;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
* Hello world!
*
*/
@RestController
public class HelloController 
{
	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot!";
	}
	@RequestMapping("/sato")
	public String sato(){
		return "Sato desu!";
	}
	@RequestMapping("/taro")
	public String taro(){
		return "taro desu!";
	}
}