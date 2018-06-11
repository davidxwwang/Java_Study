

package com.yiibai.output;

import com.yiibai.output.IOutputGenerator;

// 格式文件生成器
public class OutputHelper
{
    // 这是个协议
    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}