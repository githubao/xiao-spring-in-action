# xiao-spring-in-action
\<spring in action> src code


"D:\win\dev\spring-1.5.6.RELEASE\bin\spring.bat" run hi.groovy

@RestController
class Hi{
    @RequestMapping("/")
    String hi(){
        "Hi!"
    }
}

