/**
 * 控制器
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 21:49
 */

@Grab("thymeleaf-spring4")

@Controller
@RequestMapping("/")
class ContactController {
    @AutoWared
    ContactRepository contactRepository

    @RequestMapping(method=RequestType.GET)
    String home(Map<String,Object> model){
        List<Contact> contacts = contactRepository.findAll()
        model.putAll([contacts:contacts])
        "home"
    }

    @RequestMapping(method=RequestType.POST)
    String submit(Contact contact){
        contactRepository.save(contact)
        "redirect:/"
    }

}
