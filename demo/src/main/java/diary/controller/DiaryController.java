package diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diary")
public class DiaryController {
	/**
	 * 日記アプリの一覧画面を表示
	 * @param model
	 * @return resources/templates/list.html
	 */
	@GetMapping
	public String diarylist(
			Model model
	  ) {
		return"list";
	}

}
