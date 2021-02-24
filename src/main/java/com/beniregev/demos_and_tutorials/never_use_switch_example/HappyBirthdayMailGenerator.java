package com.beniregev.demos_and_tutorials.never_use_switch_example;

import org.springframework.stereotype.Component;

/**
 * <div>
 *     <div>*** Demo ***</div>
 *     <p>print e-mail Happy Birthday message. </p>
 * </div>
 * @author Binyamin Regev
 * @since 1.8
 */
@Component("1")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "Happy birthday to you";
    }

    @Override
    public int getMyCode() {
        return 3;
    }
}
