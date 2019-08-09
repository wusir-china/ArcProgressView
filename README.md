# ArcProgressView
一款圆弧进度条
* 预览图效果
<div class='row'>
        <img src='/img/img1.png' width="300px"/>
</div>
1.xml布局中
    
    <com.wusir.arcprogressview.ArcProgressView
        android:id="@+id/arcProgressView"
        android:layout_width="100dp"
        android:layout_height="200dp"
        android:layout_gravity="center_horizontal"
        app:antiAlias="true"
        app:bgArcColor="@color/colorAccent"
        app:hint="百分比"
        app:hintSize="15sp"
        app:maxValue="100"
        app:startAngle="135"
        app:sweepAngle="270"
        app:textOffsetPercentInRadius="0.5"
        app:unit="%"
        app:unitSize="15sp"
        app:valueSize="20sp" />
    

2.代码中

    private ArcProgressView arcProgressView;
    private Random mRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arcProgressView =findViewById(R.id.arcProgressView);
        mRandom = new Random();
        float value=mRandom.nextFloat() * arcProgressView.getMaxValue();
        arcProgressView.setValue(value);
    }
    
    
3.除了布局中可以定义值，还可以通过代码设置，另外一些接口持续完善中。
