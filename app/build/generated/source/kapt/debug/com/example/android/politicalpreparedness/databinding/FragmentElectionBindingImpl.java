package com.example.android.politicalpreparedness.databinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentElectionBindingImpl extends FragmentElectionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.upcoming_elections_textview, 2);
        sViewsWithIds.put(R.id.save_elections_textview, 3);
        sViewsWithIds.put(R.id.up_coming_recycler_view, 4);
        sViewsWithIds.put(R.id.save_election_recycler_view, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentElectionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentElectionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.connectionErrorImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.electionViewModel == variableId) {
            setElectionViewModel((com.example.android.politicalpreparedness.election.ElectionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setElectionViewModel(@Nullable com.example.android.politicalpreparedness.election.ElectionsViewModel ElectionViewModel) {
        this.mElectionViewModel = ElectionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.electionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeElectionViewModelIsNetworkAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeElectionViewModelIsNetworkAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> ElectionViewModelIsNetworkAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxElectionViewModelIsNetworkAvailable = false;
        boolean electionViewModelIsNetworkAvailable = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> ElectionViewModelIsNetworkAvailable1 = null;
        com.example.android.politicalpreparedness.election.ElectionsViewModel electionViewModel = mElectionViewModel;
        java.lang.Boolean electionViewModelIsNetworkAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxElectionViewModelIsNetworkAvailableGetValue = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (electionViewModel != null) {
                    // read electionViewModel.isNetworkAvailable
                    ElectionViewModelIsNetworkAvailable1 = electionViewModel.isNetworkAvailable();
                }
                updateLiveDataRegistration(0, ElectionViewModelIsNetworkAvailable1);


                if (ElectionViewModelIsNetworkAvailable1 != null) {
                    // read electionViewModel.isNetworkAvailable.getValue()
                    electionViewModelIsNetworkAvailableGetValue = ElectionViewModelIsNetworkAvailable1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(electionViewModel.isNetworkAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxElectionViewModelIsNetworkAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(electionViewModelIsNetworkAvailableGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(electionViewModel.isNetworkAvailable.getValue())
                electionViewModelIsNetworkAvailable = !androidxDatabindingViewDataBindingSafeUnboxElectionViewModelIsNetworkAvailableGetValue;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(electionViewModel.isNetworkAvailable.getValue()))
                androidxDatabindingViewDataBindingSafeUnboxElectionViewModelIsNetworkAvailable = androidx.databinding.ViewDataBinding.safeUnbox(electionViewModelIsNetworkAvailable);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.connectionErrorImage, androidxDatabindingViewDataBindingSafeUnboxElectionViewModelIsNetworkAvailable);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): electionViewModel.isNetworkAvailable
        flag 1 (0x2L): electionViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}