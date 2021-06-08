package com.example.android.politicalpreparedness.databinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentVoterInfoBindingImpl extends FragmentVoterInfoBinding implements com.example.android.politicalpreparedness.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.state_header, 5);
        sViewsWithIds.put(R.id.address_group, 6);
        sViewsWithIds.put(R.id.state_correspondence_header, 7);
        sViewsWithIds.put(R.id.address, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentVoterInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentVoterInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.Group) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.electionDate.setTag(null);
        this.electionName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stateBallot.setTag(null);
        this.stateLocations.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.android.politicalpreparedness.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.example.android.politicalpreparedness.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.voterInfoViewModel == variableId) {
            setVoterInfoViewModel((com.example.android.politicalpreparedness.election.VoterInfoViewModel) variable);
        }
        else if (BR.election == variableId) {
            setElection((com.example.android.politicalpreparedness.network.models.Election) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVoterInfoViewModel(@Nullable com.example.android.politicalpreparedness.election.VoterInfoViewModel VoterInfoViewModel) {
        this.mVoterInfoViewModel = VoterInfoViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.voterInfoViewModel);
        super.requestRebind();
    }
    public void setElection(@Nullable com.example.android.politicalpreparedness.network.models.Election Election) {
        this.mElection = Election;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.election);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVoterInfoViewModelHasBallotInfo((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVoterInfoViewModelHasVotingLocationsInfo((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelHasBallotInfo(androidx.lifecycle.LiveData<java.lang.String> VoterInfoViewModelHasBallotInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelHasVotingLocationsInfo(androidx.lifecycle.LiveData<java.lang.String> VoterInfoViewModelHasVotingLocationsInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String ElectionName1 = null;
        java.lang.String voterInfoViewModelHasBallotInfoGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> voterInfoViewModelHasBallotInfo = null;
        androidx.lifecycle.LiveData<java.lang.String> voterInfoViewModelHasVotingLocationsInfo = null;
        com.example.android.politicalpreparedness.election.VoterInfoViewModel voterInfoViewModel = mVoterInfoViewModel;
        java.lang.String voterInfoViewModelHasVotingLocationsInfoGetValue = null;
        com.example.android.politicalpreparedness.network.models.Election election = mElection;

        if ((dirtyFlags & 0x17L) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.hasBallotInfo
                        voterInfoViewModelHasBallotInfo = voterInfoViewModel.getHasBallotInfo();
                    }
                    updateLiveDataRegistration(0, voterInfoViewModelHasBallotInfo);


                    if (voterInfoViewModelHasBallotInfo != null) {
                        // read voterInfoViewModel.hasBallotInfo.getValue()
                        voterInfoViewModelHasBallotInfoGetValue = voterInfoViewModelHasBallotInfo.getValue();
                    }
            }
            if ((dirtyFlags & 0x16L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.hasVotingLocationsInfo
                        voterInfoViewModelHasVotingLocationsInfo = voterInfoViewModel.getHasVotingLocationsInfo();
                    }
                    updateLiveDataRegistration(1, voterInfoViewModelHasVotingLocationsInfo);


                    if (voterInfoViewModelHasVotingLocationsInfo != null) {
                        // read voterInfoViewModel.hasVotingLocationsInfo.getValue()
                        voterInfoViewModelHasVotingLocationsInfoGetValue = voterInfoViewModelHasVotingLocationsInfo.getValue();
                    }
            }
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (election != null) {
                    // read election.name
                    ElectionName1 = election.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setElectionDate(this.electionDate, election);
            this.electionName.setTitle(ElectionName1);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.stateBallot.setOnClickListener(mCallback3);
            this.stateLocations.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.bindVisible(this.stateBallot, voterInfoViewModelHasBallotInfoGetValue);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.bindVisible(this.stateLocations, voterInfoViewModelHasVotingLocationsInfoGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // voterInfoViewModel
                com.example.android.politicalpreparedness.election.VoterInfoViewModel voterInfoViewModel = mVoterInfoViewModel;
                // voterInfoViewModel != null
                boolean voterInfoViewModelJavaLangObjectNull = false;



                voterInfoViewModelJavaLangObjectNull = (voterInfoViewModel) != (null);
                if (voterInfoViewModelJavaLangObjectNull) {


                    voterInfoViewModel.onClickBallotInformationClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // voterInfoViewModel
                com.example.android.politicalpreparedness.election.VoterInfoViewModel voterInfoViewModel = mVoterInfoViewModel;
                // voterInfoViewModel != null
                boolean voterInfoViewModelJavaLangObjectNull = false;



                voterInfoViewModelJavaLangObjectNull = (voterInfoViewModel) != (null);
                if (voterInfoViewModelJavaLangObjectNull) {


                    voterInfoViewModel.onClickVotingLocationsClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): voterInfoViewModel.hasBallotInfo
        flag 1 (0x2L): voterInfoViewModel.hasVotingLocationsInfo
        flag 2 (0x3L): voterInfoViewModel
        flag 3 (0x4L): election
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}