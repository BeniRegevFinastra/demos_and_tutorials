package com.beniregev.demos_and_tutorials.never_use_switch_example;

import org.springframework.stereotype.Component;

/**
 * <div>
 *     <div>*** Demo ***</div>
 *     <p>print e-mail callback message. </p>
 * </div>
 * @author Binyamin Regev
 * @since 1.8
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //50 lines of code
        return "<html> don't call us we call you </html>";
    }

    @Override
    public int getMyCode() {
        return 2;
    }
}
