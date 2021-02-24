package com.beniregev.demos_and_tutorials.never_use_switch_example;

import org.springframework.stereotype.Component;

/**
 * <div>
 *     <div>*** Demo ***</div>
 *     <p>print e-mail verification-code message. </p>
 * </div>
 * @author Binyamin Regev
 * @since 1.8
 */
@Component
public class EmailVerificationMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {

        /*
            nn lines of code
        */
        return "<html><h1>>E-Mail Verification Notice</h1><div><p>" +
                "<div>Your Verification code is: W3lc0m3!</div>" +
                "</p></div></html>";
    }

    @Override
    public int getMyCode() {
        return 4;
    }
}
