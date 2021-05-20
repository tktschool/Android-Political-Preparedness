package com.example.android.politicalpreparedness.databinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemRepresenttativeBindingImpl extends ListItemRepresenttativeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.twitter_icon, 5);
        sViewsWithIds.put(R.id.facebook_icon, 6);
        sViewsWithIds.put(R.id.www_icon, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemRepresenttativeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemRepresenttativeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.partyName.setTag(null);
        this.representativeName.setTag(null);
        this.representativePhoto.setTag(null);
        this.representativeTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.representative == variableId) {
            setRepresentative((com.example.android.politicalpreparedness.representative.model.Representative) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRepresentative(@Nullable com.example.android.politicalpreparedness.representative.model.Representative Representative) {
        this.mRepresentative = Representative;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.representative);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.android.politicalpreparedness.representative.model.Representative representative = mRepresentative;
        java.lang.String representativeOfficialParty = null;
        java.lang.String representativeOfficialName = null;
        java.lang.String representativeOfficialPhotoUrl = null;
        com.example.android.politicalpreparedness.network.models.Office representativeOffice = null;
        java.lang.String representativeOfficeName = null;
        com.example.android.politicalpreparedness.network.models.Official representativeOfficial = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (representative != null) {
                    // read representative.office
                    representativeOffice = representative.getOffice();
                    // read representative.official
                    representativeOfficial = representative.getOfficial();
                }


                if (representativeOffice != null) {
                    // read representative.office.name
                    representativeOfficeName = representativeOffice.getName();
                }
                if (representativeOfficial != null) {
                    // read representative.official.party
                    representativeOfficialParty = representativeOfficial.getParty();
                    // read representative.official.name
                    representativeOfficialName = representativeOfficial.getName();
                    // read representative.official.photoUrl
                    representativeOfficialPhotoUrl = representativeOfficial.getPhotoUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.partyName, representativeOfficialParty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.representativeName, representativeOfficialName);
            com.example.android.politicalpreparedness.representative.adapter.RepresentativeBindingAdaptersKt.fetchImage(this.representativePhoto, representativeOfficialPhotoUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.representativeTitle, representativeOfficeName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): representative
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}