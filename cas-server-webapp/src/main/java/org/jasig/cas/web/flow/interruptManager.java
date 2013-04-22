package org.jasig.cas.web.flow;

/**
 *
 * @author Shawn Hott & Kendall Bates
 * @version 1.0 Alpha 3-4-13
 * @since 3.5.1
 */
 

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
 
public final class InterruptManager {


    
    private List<InterruptHandler> interruptHandlers = new ArrayList<InterruptHandler>();




    public void setInterruptHandlers(final List<InterruptHandler> interruptHandlers) {

        this.interruptHandlers = interruptHandlers;

    }



}