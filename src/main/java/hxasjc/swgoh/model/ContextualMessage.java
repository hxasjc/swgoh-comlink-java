package hxasjc.swgoh.model;

import hxasjc.swgoh.enums.ContextualMessageType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ContextualMessage {
    private String id;
    private ContextualMessageType type;
    private String titleKey;
    private String textKey;
    private PointAtElement pointAt;
    private String[] appearEvent;
    private String[] dismissEvent;
    private String actionLink;
    private String nextMessageId;
    private Requirement clientRequirement;
    private CharacterDialog characterDialog;
    private String nextMessageIdDecline;
    private boolean canDismissWhileHidden;
    private int ftueSubStep;
    private CantinaCharacterDialog cantinaCharacterDialog;
    private ActionLink actionLinkDef;
    private StorePromoDialog storePromoDialog;
    private boolean showExitButton;

    public String getId() {
        return id;
    }

    public ContextualMessageType getType() {
        return type;
    }

    public String getTitleKey() {
        return titleKey;
    }

    public String getTextKey() {
        return textKey;
    }

    public PointAtElement getPointAt() {
        return pointAt;
    }

    public String[] getAppearEvent() {
        return appearEvent;
    }

    public String[] getDismissEvent() {
        return dismissEvent;
    }

    public String getActionLink() {
        return actionLink;
    }

    public String getNextMessageId() {
        return nextMessageId;
    }

    public Requirement getClientRequirement() {
        return clientRequirement;
    }

    public CharacterDialog getCharacterDialog() {
        return characterDialog;
    }

    public String getNextMessageIdDecline() {
        return nextMessageIdDecline;
    }

    public boolean isCanDismissWhileHidden() {
        return canDismissWhileHidden;
    }

    public int getFtueSubStep() {
        return ftueSubStep;
    }

    public CantinaCharacterDialog getCantinaCharacterDialog() {
        return cantinaCharacterDialog;
    }

    public ActionLink getActionLinkDef() {
        return actionLinkDef;
    }

    public StorePromoDialog getStorePromoDialog() {
        return storePromoDialog;
    }

    public boolean isShowExitButton() {
        return showExitButton;
    }

    @Override
    public String toString() {
        return "ContextualMessage{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", titleKey='" + titleKey + '\'' +
                ", textKey='" + textKey + '\'' +
                ", pointAt=" + pointAt +
                ", appearEvent=" + Arrays.toString(appearEvent) +
                ", dismissEvent=" + Arrays.toString(dismissEvent) +
                ", actionLink='" + actionLink + '\'' +
                ", nextMessageId='" + nextMessageId + '\'' +
                ", clientRequirement=" + clientRequirement +
                ", characterDialog=" + characterDialog +
                ", nextMessageIdDecline='" + nextMessageIdDecline + '\'' +
                ", canDismissWhileHidden=" + canDismissWhileHidden +
                ", ftueSubStep=" + ftueSubStep +
                ", cantinaCharacterDialog=" + cantinaCharacterDialog +
                ", actionLinkDef=" + actionLinkDef +
                ", storePromoDialog=" + storePromoDialog +
                ", showExitButton=" + showExitButton +
                '}';
    }
}
