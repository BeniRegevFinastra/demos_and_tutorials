package com.beniregev.demos_and_tutorials.never_use_switch_example;

import org.springframework.stereotype.Component;

/**
 * <div>
 *     <p>
 *         <div>To add a new class option you need to:</div>
 *         <div>1. Create a new class.</div>
 *         <div>2. Annotate your class with Spring framework <i>@Component</i> annotation.</div>
 *         <div>3. Your new class must implement {@link MailGenerator} interface.</div>
 *         <div>4. You class must implement methods of {@link MailGenerator} interface, returning a UNIQUE code in method {@link #getMyCode()}.</div>
 *     </p>
 * </div>
 * @author Binyamin Regev
 * @since 1.8
 */
@Component
public class PhoneSMSVerificationMessage implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "Your Verification code is 'Finastra'";
    }

    @Override
    public int getMyCode() {
        return 5;
    }
}
