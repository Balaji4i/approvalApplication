package fusion.apr.view.backing;

import fusion.apr.view.utils.ADFUtils;
import fusion.apr.view.utils.JSFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichCommandImageLink;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class AddEditAttribute {
    private RichPageTemplate pt1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichPanelBox pb1;
    private RichPanelCollection pc1;
    private RichToolbar t1;
    private RichTable t2;
    private RichCommandImageLink cil1;
    private RichSpacer s2;
    private RichCommandImageLink cil2;
    private RichPanelBox pb2;
    private RichPanelCollection pc2;
    private RichToolbar t3;
    private RichTable t4;
    String str;
    private RichCommandImageLink cil3;
    private RichSpacer s3;
    private RichCommandImageLink cil5;
    private RichSpacer s4;
    private RichCommandImageLink cil4;
    private RichTable t5;
    private RichPanelBox pb3;
    private RichPanelCollection pc3;
    private RichToolbar t6;
    private RichCommandImageLink cil6;
    private RichSpacer s5;
    private RichCommandImageLink cil7;
    private RichSelectBooleanCheckbox sbc4;

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setCil1(RichCommandImageLink cil1) {
        this.cil1 = cil1;
    }

    public RichCommandImageLink getCil1() {
        return cil1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setCil2(RichCommandImageLink cil2) {
        this.cil2 = cil2;
    }

    public RichCommandImageLink getCil2() {
        return cil2;
    }
    
    public void onClickAttrCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert").execute();
        vo.getCurrentRow().setAttribute("SeqNumber", count1);
    }
    public void onClickCommit(ActionEvent actionEvent) {
        ADFUtils.findOperation("Commit").execute();
        ViewObject hdr = ADFUtils.findIterator("ApprAttrGroup_VO1Iterator").getViewObject();
        hdr.executeQuery();
        JSFUtils.addFacesInformationMessage("Record Saved Successfully!");
    }

    public void onClickRollback(ActionEvent actionEvent) {
        ADFUtils.findOperation("Rollback").execute();
    }

    public void onClickClose(ActionEvent actionEvent) {
//        getP1().cancel();
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setT3(RichToolbar t3) {
        this.t3 = t3;
    }

    public RichToolbar getT3() {
        return t3;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }
    public boolean getrender1() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE1");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;
        }
        return status;
    }

    public boolean getrender2() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE2");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;
        }
        return status;
    }

    public boolean getrender3() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE3");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;

        }

        return status;
    }

    public boolean getrender4() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE4");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {

            status = true;

        }

        return status;
    }

    public boolean getrender5() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE5");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;
        }
        return status;
    }

    public String getsegment1() {
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE1");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
    rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }


    }

    public String getsegment2() {
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE2");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
    rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }

    }

    public String getsegment3() {
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE3");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
    rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }

    }

    public String getsegment4() {
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE4");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
    rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }

    }

    public String getsegment5() {
        ViewObject vo =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("AttributeColumn", "ATTRIBUTE5");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
    rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {
            return null;
        }

    }

    public void setCil3(RichCommandImageLink cil3) {
        this.cil3 = cil3;
    }

    public RichCommandImageLink getCil3() {
        return cil3;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }


    public void setCil5(RichCommandImageLink cil5) {
        this.cil5 = cil5;
    }

    public RichCommandImageLink getCil5() {
        return cil5;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void onclicktabrefresh(DisclosureEvent disclosureEvent) {
        ViewObject hdr = ADFUtils.findIterator("ApprAttrGroup_VO1Iterator").getViewObject();
        Row curhdr = hdr.getCurrentRow();
        hdr.setCurrentRow(curhdr);
        ViewObject att =
            ADFUtils.findIterator("ApprAttributes_VO1Iterator").getViewObject();
        ViewCriteria vc = att.createViewCriteria();
        ViewCriteriaRow vcr = vc.createViewCriteriaRow();
        vcr.setAttribute("AttrGrpId", curhdr.getAttribute("AttrGrpId"));
        vc.addRow(vcr);
        att.applyViewCriteria(vc);
        att.executeQuery();
        System.err.println("dddddd");
        att.executeQuery();
        AdfFacesContext.getCurrentInstance().addPartialTarget(t2);
             
    }

    public void OnclickCreate(ActionEvent actionEvent) {
        ADFUtils.findOperation("CreateInsert1").execute();
//     ADFUtils.findOperation("CreateInsert1").execute();
//     JSFUtils.resolveExpression("#{bindings.CreateInsert1.execute}");
//     ViewObject vo =
//            ADFUtils.findIterator("ApprAttrComb_VO1Iterator").getViewObject();
//     vo.executeQuery();
//     AdfFacesContext.getCurrentInstance().addPartialTarget(t4);
    }

    public void setCil4(RichCommandImageLink cil4) {
        this.cil4 = cil4;
    }

    public RichCommandImageLink getCil4() {
        return cil4;
    }

    public void onclickCombrefresh(DisclosureEvent disclosureEvent) {
        ViewObject vo = ADFUtils.findIterator("ApprAttrComb_VO1Iterator").getViewObject();
        vo.executeQuery();
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setCil6(RichCommandImageLink cil6) {
        this.cil6 = cil6;
    }

    public RichCommandImageLink getCil6() {
        return cil6;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void setCil7(RichCommandImageLink cil7) {
        this.cil7 = cil7;
    }

    public RichCommandImageLink getCil7() {
        return cil7;
    }

    public void setSbc4(RichSelectBooleanCheckbox sbc4) {
        this.sbc4 = sbc4;
    }

    public RichSelectBooleanCheckbox getSbc4() {
        return sbc4;
    }
}
