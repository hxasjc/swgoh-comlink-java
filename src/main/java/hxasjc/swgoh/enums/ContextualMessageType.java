package hxasjc.swgoh.enums;

// TODO: 2025-01-10 check all usages of class to make sure that fields are using the correct class; accidentally created this class as ContextualMessageGroup and used it in places where the json spec specifies an object and not this enum
public enum ContextualMessageType {
    ContextualMessageType_DEFAULT,
    POINTATVIEWELEMENT,
    CHARACTERDIALOG,
    MODALDIALOGONEBUTTON,
    MODALDIALOGTWOBUTTON,
    CANTINACHARACTERDIALOG,
    UNITUNLOCK,
    STOREPROMODIALOG,
    CHALLENGEQUESTREWARDS
}
