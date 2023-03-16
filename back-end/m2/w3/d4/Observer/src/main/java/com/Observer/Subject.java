package com.Observer;
//interfaccia del soggetto osservato
public interface Subject {
public void register (Observer o);
public void unregister (Observer o);
public void notifyAllObserver (String s);
}
