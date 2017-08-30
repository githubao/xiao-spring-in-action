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


GET /autoconfig
GET /beans
GET /configprops
GET /dump : 线程和堆栈的信息
GET /env
GET /env/{name}
GET /health
GET /info
GET /metrics: 应用的请求的响应次数等
GET /metrics/{name}
GET /trace: 应用的元数据
POST /shutdown: 关闭应用

