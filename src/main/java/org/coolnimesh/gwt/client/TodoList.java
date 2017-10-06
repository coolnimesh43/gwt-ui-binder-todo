package org.coolnimesh.gwt.client;

import java.util.Arrays;
import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.IronIconElement;
import com.vaadin.polymer.paper.PaperIconItemElement;

public class TodoList implements EntryPoint {

    Logger logger = Logger.getLogger("TodoList");

    @Override
    public void onModuleLoad() {
        Polymer.importHref(Arrays.asList("iron-icons/iron-icons.html", PaperIconItemElement.SRC, IronIconElement.SRC), new Function() {
            @Override
            public Object call(Object args) {
                startApplication();
                return null;
            }
        });
    }

    private void startApplication() {
        RootPanel.get().add(new Main());
    }

}
