package vip.qsos.demo

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import qsos.lib.base.base.BaseActivity
import qsos.lib.base.routepath.BasePath

/**
 * @author : 华清松
 * @description : 主界面
 */
class MainActivity(
    override val layoutId: Int? = R.layout.activity_main,
    override val reload: Boolean = false,
    override var statusBarColor: Int? = null
) : BaseActivity() {
    override fun getData() {

    }

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun initView() {
        showToast("你好。即将跳转到功能列表界面")

        ARouter.getInstance().build(BasePath.MAIN).navigation()
    }

}
