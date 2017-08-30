/**
 * 控制器
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 21:49
 */

@Grab("thymeleaf-spring4")
@Grab("spring-boot-starter-actuator")

@Controller
@RequestMapping("/")
class ContactController {
    @Autowired
    ContactRepository contactRepository

    @RequestMapping(method = RequestMethod.GET)
    String home(Map<String, Object> model) {
        List<Contact> contacts = contactRepository.findAll()
        model.putAll([contacts: contacts])
        "home"
    }

    @RequestMapping(method = RequestMethod.POST)
    String submit(Contact contact) {
        contactRepository.save(contact)
        "redirect:/"
    }

}
