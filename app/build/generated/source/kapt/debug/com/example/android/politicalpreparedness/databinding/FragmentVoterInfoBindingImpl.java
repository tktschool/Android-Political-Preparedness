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
        sViewsWithIds.put(R.id.state_header, 9);
        sViewsWithIds.put(R.id.state_correspondence_header, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentVoterInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentVoterInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.Group) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            );
        this.address.setTag(null);
        this.addressGroup.setTag(null);
        this.connectionErrorImage.setTag(null);
        this.electionDate.setTag(null);
        this.electionName.setTag(null);
        this.followButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stateBallot.setTag(null);
        this.stateLocations.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.android.politicalpreparedness.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.example.android.politicalpreparedness.generated.callback.OnClickListener(this, 1);
        mCallback3 = new com.example.android.politicalpreparedness.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.voterInfoViewModel);
        super.requestRebind();
    }
    public void setElection(@Nullable com.example.android.politicalpreparedness.network.models.Election Election) {
        this.mElection = Election;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.election);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVoterInfoViewModelHasVotingLocationsInfo((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVoterInfoViewModelHasCorrespondenceInformation((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVoterInfoViewModelHasBallotInfo((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVoterInfoViewModelCorrespondenceAddress((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVoterInfoViewModelFollowButtonState((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVoterInfoViewModelIsNetworkAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelHasVotingLocationsInfo(androidx.lifecycle.LiveData<java.lang.String> VoterInfoViewModelHasVotingLocationsInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelHasCorrespondenceInformation(androidx.lifecycle.LiveData<java.lang.Boolean> VoterInfoViewModelHasCorrespondenceInformation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelHasBallotInfo(androidx.lifecycle.LiveData<java.lang.String> VoterInfoViewModelHasBallotInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelCorrespondenceAddress(androidx.lifecycle.LiveData<java.lang.String> VoterInfoViewModelCorrespondenceAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelFollowButtonState(androidx.lifecycle.LiveData<java.lang.String> VoterInfoViewModelFollowButtonState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoterInfoViewModelIsNetworkAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> VoterInfoViewModelIsNetworkAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.Boolean voterInfoViewModelHasCorrespondenceInformationGetValue = null;
        java.lang.String voterInfoViewModelHasBallotInfoGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> voterInfoViewModelHasVotingLocationsInfo = null;
        java.lang.Boolean voterInfoViewModelIsNetworkAvailableGetValue = null;
        com.example.android.politicalpreparedness.election.VoterInfoViewModel voterInfoViewModel = mVoterInfoViewModel;
        java.lang.String voterInfoViewModelHasVotingLocationsInfoGetValue = null;
        com.example.android.politicalpreparedness.network.models.Election election = mElection;
        boolean voterInfoViewModelIsNetworkAvailable = false;
        java.lang.String ElectionName1 = null;
        java.lang.String voterInfoViewModelCorrespondenceAddressGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> voterInfoViewModelHasCorrespondenceInformation = null;
        androidx.lifecycle.LiveData<java.lang.String> voterInfoViewModelHasBallotInfo = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelIsNetworkAvailable = false;
        java.lang.String voterInfoViewModelFollowButtonStateGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> voterInfoViewModelCorrespondenceAddress = null;
        androidx.lifecycle.LiveData<java.lang.String> voterInfoViewModelFollowButtonState = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> VoterInfoViewModelIsNetworkAvailable1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelHasCorrespondenceInformationGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelIsNetworkAvailableGetValue = false;

        if ((dirtyFlags & 0x17fL) != 0) {


            if ((dirtyFlags & 0x141L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.hasVotingLocationsInfo
                        voterInfoViewModelHasVotingLocationsInfo = voterInfoViewModel.getHasVotingLocationsInfo();
                    }
                    updateLiveDataRegistration(0, voterInfoViewModelHasVotingLocationsInfo);


                    if (voterInfoViewModelHasVotingLocationsInfo != null) {
                        // read voterInfoViewModel.hasVotingLocationsInfo.getValue()
                        voterInfoViewModelHasVotingLocationsInfoGetValue = voterInfoViewModelHasVotingLocationsInfo.getValue();
                    }
            }
            if ((dirtyFlags & 0x142L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.hasCorrespondenceInformation
                        voterInfoViewModelHasCorrespondenceInformation = voterInfoViewModel.getHasCorrespondenceInformation();
                    }
                    updateLiveDataRegistration(1, voterInfoViewModelHasCorrespondenceInformation);


                    if (voterInfoViewModelHasCorrespondenceInformation != null) {
                        // read voterInfoViewModel.hasCorrespondenceInformation.getValue()
                        voterInfoViewModelHasCorrespondenceInformationGetValue = voterInfoViewModelHasCorrespondenceInformation.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModel.hasCorrespondenceInformation.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelHasCorrespondenceInformationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModelHasCorrespondenceInformationGetValue);
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.hasBallotInfo
                        voterInfoViewModelHasBallotInfo = voterInfoViewModel.getHasBallotInfo();
                    }
                    updateLiveDataRegistration(2, voterInfoViewModelHasBallotInfo);


                    if (voterInfoViewModelHasBallotInfo != null) {
                        // read voterInfoViewModel.hasBallotInfo.getValue()
                        voterInfoViewModelHasBallotInfoGetValue = voterInfoViewModelHasBallotInfo.getValue();
                    }
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.correspondenceAddress
                        voterInfoViewModelCorrespondenceAddress = voterInfoViewModel.getCorrespondenceAddress();
                    }
                    updateLiveDataRegistration(3, voterInfoViewModelCorrespondenceAddress);


                    if (voterInfoViewModelCorrespondenceAddress != null) {
                        // read voterInfoViewModel.correspondenceAddress.getValue()
                        voterInfoViewModelCorrespondenceAddressGetValue = voterInfoViewModelCorrespondenceAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.followButtonState
                        voterInfoViewModelFollowButtonState = voterInfoViewModel.getFollowButtonState();
                    }
                    updateLiveDataRegistration(4, voterInfoViewModelFollowButtonState);


                    if (voterInfoViewModelFollowButtonState != null) {
                        // read voterInfoViewModel.followButtonState.getValue()
                        voterInfoViewModelFollowButtonStateGetValue = voterInfoViewModelFollowButtonState.getValue();
                    }
            }
            if ((dirtyFlags & 0x160L) != 0) {

                    if (voterInfoViewModel != null) {
                        // read voterInfoViewModel.isNetworkAvailable
                        VoterInfoViewModelIsNetworkAvailable1 = voterInfoViewModel.isNetworkAvailable();
                    }
                    updateLiveDataRegistration(5, VoterInfoViewModelIsNetworkAvailable1);


                    if (VoterInfoViewModelIsNetworkAvailable1 != null) {
                        // read voterInfoViewModel.isNetworkAvailable.getValue()
                        voterInfoViewModelIsNetworkAvailableGetValue = VoterInfoViewModelIsNetworkAvailable1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModel.isNetworkAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelIsNetworkAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModelIsNetworkAvailableGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModel.isNetworkAvailable.getValue())
                    voterInfoViewModelIsNetworkAvailable = !androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelIsNetworkAvailableGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModel.isNetworkAvailable.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelIsNetworkAvailable = androidx.databinding.ViewDataBinding.safeUnbox(voterInfoViewModelIsNetworkAvailable);
            }
        }
        if ((dirtyFlags & 0x180L) != 0) {



                if (election != null) {
                    // read election.name
                    ElectionName1 = election.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, voterInfoViewModelCorrespondenceAddressGetValue);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.addressGroup, androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelHasCorrespondenceInformationGetValue);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.connectionErrorImage, androidxDatabindingViewDataBindingSafeUnboxVoterInfoViewModelIsNetworkAvailable);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setElectionDate(this.electionDate, election);
            this.electionName.setTitle(ElectionName1);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.followButton.setOnClickListener(mCallback4);
            this.stateBallot.setOnClickListener(mCallback3);
            this.stateLocations.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.followButton, voterInfoViewModelFollowButtonStateGetValue);
            com.example.android.politicalpreparedness.utils.BindingUtilsKt.bindVisible(this.followButton, voterInfoViewModelFollowButtonStateGetValue);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.bindVisible(this.stateBallot, voterInfoViewModelHasBallotInfoGetValue);
        }
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.bindVisible(this.stateLocations, voterInfoViewModelHasVotingLocationsInfoGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // voterInfoViewModel
                com.example.android.politicalpreparedness.election.VoterInfoViewModel voterInfoViewModel = mVoterInfoViewModel;
                // voterInfoViewModel != null
                boolean voterInfoViewModelJavaLangObjectNull = false;



                voterInfoViewModelJavaLangObjectNull = (voterInfoViewModel) != (null);
                if (voterInfoViewModelJavaLangObjectNull) {


                    voterInfoViewModel.onFollowButtonClicked();
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


                    voterInfoViewModel.onVotingLocationsClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // voterInfoViewModel
                com.example.android.politicalpreparedness.election.VoterInfoViewModel voterInfoViewModel = mVoterInfoViewModel;
                // voterInfoViewModel != null
                boolean voterInfoViewModelJavaLangObjectNull = false;



                voterInfoViewModelJavaLangObjectNull = (voterInfoViewModel) != (null);
                if (voterInfoViewModelJavaLangObjectNull) {


                    voterInfoViewModel.onBallotInformationClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): voterInfoViewModel.hasVotingLocationsInfo
        flag 1 (0x2L): voterInfoViewModel.hasCorrespondenceInformation
        flag 2 (0x3L): voterInfoViewModel.hasBallotInfo
        flag 3 (0x4L): voterInfoViewModel.correspondenceAddress
        flag 4 (0x5L): voterInfoViewModel.followButtonState
        flag 5 (0x6L): voterInfoViewModel.isNetworkAvailable
        flag 6 (0x7L): voterInfoViewModel
        flag 7 (0x8L): election
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}