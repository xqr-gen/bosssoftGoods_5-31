package com.bosssoft.springboot5_31.controller;

import com.bosssoft.springboot5_31.service.impl.PayServiceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

/**
 * 支付，
 * @author xqr
 */
@RestController
@Slf4j
public class PayController {
    @Autowired
    PayServiceImpl payService;



}
