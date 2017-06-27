package com.jk.action;

import com.jk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo11 on 2017/6/26.
 */
@Controller
@RequestMapping("item")
public class ItemAction {
    @Autowired
    private ItemService itemService;




}
