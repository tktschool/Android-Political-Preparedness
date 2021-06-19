package com.example.android.politicalpreparedness.databinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepresentativeBindingImpl extends FragmentRepresentativeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.representatives_search_constraint_layout, 10);
        sViewsWithIds.put(R.id.search_title, 11);
        sViewsWithIds.put(R.id.my_representatives_constraint_layout, 12);
        sViewsWithIds.put(R.id.representative_title, 13);
        sViewsWithIds.put(R.id.representatives_recyclerview, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.motion.widget.MotionLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener addressLine1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.address.getValue().line1
            //         is viewModel.address.getValue().setLine1((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressLine1);
            // localize variables for thread safety
            // viewModel.address != null
            boolean viewModelAddressJavaLangObjectNull = false;
            // viewModel.address.getValue()
            com.example.android.politicalpreparedness.network.models.Address viewModelAddressGetValue = null;
            // viewModel.address
            androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> viewModelAddress = null;
            // viewModel.address.getValue() != null
            boolean viewModelAddressGetValueJavaLangObjectNull = false;
            // viewModel
            com.example.android.politicalpreparedness.representative.RepresentativeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.address.getValue().line1
            java.lang.String viewModelAddressLine1 = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddress = viewModel.getAddress();

                viewModelAddressJavaLangObjectNull = (viewModelAddress) != (null);
                if (viewModelAddressJavaLangObjectNull) {


                    viewModelAddressGetValue = viewModelAddress.getValue();

                    viewModelAddressGetValueJavaLangObjectNull = (viewModelAddressGetValue) != (null);
                    if (viewModelAddressGetValueJavaLangObjectNull) {




                        viewModelAddressGetValue.setLine1(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener addressLine2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.address.getValue().line2
            //         is viewModel.address.getValue().setLine2((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressLine2);
            // localize variables for thread safety
            // viewModel.address != null
            boolean viewModelAddressJavaLangObjectNull = false;
            // viewModel.address.getValue()
            com.example.android.politicalpreparedness.network.models.Address viewModelAddressGetValue = null;
            // viewModel.address
            androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> viewModelAddress = null;
            // viewModel.address.getValue() != null
            boolean viewModelAddressGetValueJavaLangObjectNull = false;
            // viewModel
            com.example.android.politicalpreparedness.representative.RepresentativeViewModel viewModel = mViewModel;
            // viewModel.address.getValue().line2
            java.lang.String viewModelAddressLine2 = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddress = viewModel.getAddress();

                viewModelAddressJavaLangObjectNull = (viewModelAddress) != (null);
                if (viewModelAddressJavaLangObjectNull) {


                    viewModelAddressGetValue = viewModelAddress.getValue();

                    viewModelAddressGetValueJavaLangObjectNull = (viewModelAddressGetValue) != (null);
                    if (viewModelAddressGetValueJavaLangObjectNull) {




                        viewModelAddressGetValue.setLine2(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener cityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.address.getValue().city
            //         is viewModel.address.getValue().setCity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(city);
            // localize variables for thread safety
            // viewModel.address != null
            boolean viewModelAddressJavaLangObjectNull = false;
            // viewModel.address.getValue()
            com.example.android.politicalpreparedness.network.models.Address viewModelAddressGetValue = null;
            // viewModel.address
            androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> viewModelAddress = null;
            // viewModel.address.getValue().city
            java.lang.String viewModelAddressCity = null;
            // viewModel.address.getValue() != null
            boolean viewModelAddressGetValueJavaLangObjectNull = false;
            // viewModel
            com.example.android.politicalpreparedness.representative.RepresentativeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddress = viewModel.getAddress();

                viewModelAddressJavaLangObjectNull = (viewModelAddress) != (null);
                if (viewModelAddressJavaLangObjectNull) {


                    viewModelAddressGetValue = viewModelAddress.getValue();

                    viewModelAddressGetValueJavaLangObjectNull = (viewModelAddressGetValue) != (null);
                    if (viewModelAddressGetValueJavaLangObjectNull) {




                        viewModelAddressGetValue.setCity(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener zipandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.address.getValue().zip
            //         is viewModel.address.getValue().setZip((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(zip);
            // localize variables for thread safety
            // viewModel.address != null
            boolean viewModelAddressJavaLangObjectNull = false;
            // viewModel.address.getValue()
            com.example.android.politicalpreparedness.network.models.Address viewModelAddressGetValue = null;
            // viewModel.address.getValue().zip
            java.lang.String viewModelAddressZip = null;
            // viewModel.address
            androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> viewModelAddress = null;
            // viewModel.address.getValue() != null
            boolean viewModelAddressGetValueJavaLangObjectNull = false;
            // viewModel
            com.example.android.politicalpreparedness.representative.RepresentativeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddress = viewModel.getAddress();

                viewModelAddressJavaLangObjectNull = (viewModelAddress) != (null);
                if (viewModelAddressJavaLangObjectNull) {


                    viewModelAddressGetValue = viewModelAddress.getValue();

                    viewModelAddressGetValueJavaLangObjectNull = (viewModelAddressGetValue) != (null);
                    if (viewModelAddressGetValueJavaLangObjectNull) {




                        viewModelAddressGetValue.setZip(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentRepresentativeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentRepresentativeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.Spinner) bindings[4]
            , (android.widget.EditText) bindings[5]
            );
        this.addressLine1.setTag(null);
        this.addressLine2.setTag(null);
        this.buttonLocation.setTag(null);
        this.buttonSearch.setTag(null);
        this.city.setTag(null);
        this.connectionErrorImage.setTag(null);
        this.internetConnectionErrorTextview.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.state.setTag(null);
        this.zip.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.android.politicalpreparedness.representative.RepresentativeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.android.politicalpreparedness.representative.RepresentativeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsNetworkAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelAddress((androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsNetworkAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsNetworkAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddress(androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> ViewModelAddress, int fieldId) {
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
        com.example.android.politicalpreparedness.network.models.Address viewModelAddressGetValue = null;
        java.lang.String viewModelAddressZip = null;
        java.lang.Boolean viewModelIsNetworkAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailable = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsNetworkAvailable = null;
        boolean ViewModelIsNetworkAvailable1 = false;
        java.lang.String viewModelAddressCity = null;
        java.lang.String viewModelAddressLine2 = null;
        java.lang.String viewModelAddressLine1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailableGetValue = false;
        androidx.lifecycle.LiveData<com.example.android.politicalpreparedness.network.models.Address> viewModelAddress = null;
        java.lang.String viewModelAddressState = null;
        com.example.android.politicalpreparedness.representative.RepresentativeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNetworkAvailable
                        viewModelIsNetworkAvailable = viewModel.isNetworkAvailable();
                    }
                    updateLiveDataRegistration(0, viewModelIsNetworkAvailable);


                    if (viewModelIsNetworkAvailable != null) {
                        // read viewModel.isNetworkAvailable.getValue()
                        viewModelIsNetworkAvailableGetValue = viewModelIsNetworkAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNetworkAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsNetworkAvailableGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNetworkAvailable.getValue())
                    ViewModelIsNetworkAvailable1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailableGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNetworkAvailable.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailable = androidx.databinding.ViewDataBinding.safeUnbox(ViewModelIsNetworkAvailable1);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.address
                        viewModelAddress = viewModel.getAddress();
                    }
                    updateLiveDataRegistration(1, viewModelAddress);


                    if (viewModelAddress != null) {
                        // read viewModel.address.getValue()
                        viewModelAddressGetValue = viewModelAddress.getValue();
                    }


                    if (viewModelAddressGetValue != null) {
                        // read viewModel.address.getValue().zip
                        viewModelAddressZip = viewModelAddressGetValue.getZip();
                        // read viewModel.address.getValue().city
                        viewModelAddressCity = viewModelAddressGetValue.getCity();
                        // read viewModel.address.getValue().line2
                        viewModelAddressLine2 = viewModelAddressGetValue.getLine2();
                        // read viewModel.address.getValue().line1
                        viewModelAddressLine1 = viewModelAddressGetValue.getLine1();
                        // read viewModel.address.getValue().state
                        viewModelAddressState = viewModelAddressGetValue.getState();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressLine1, viewModelAddressLine1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressLine2, viewModelAddressLine2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.city, viewModelAddressCity);
            com.example.android.politicalpreparedness.representative.adapter.RepresentativeBindingAdaptersKt.setNewValue(this.state, viewModelAddressState);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.zip, viewModelAddressZip);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressLine1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressLine1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressLine2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressLine2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.city, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, cityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.zip, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, zipandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.buttonLocation, androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailableGetValue);
            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.buttonSearch, androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailableGetValue);
            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.connectionErrorImage, androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailable);
            com.example.android.politicalpreparedness.utils.BindingUtilsKt.setVisibility(this.internetConnectionErrorTextview, androidxDatabindingViewDataBindingSafeUnboxViewModelIsNetworkAvailable);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isNetworkAvailable
        flag 1 (0x2L): viewModel.address
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}