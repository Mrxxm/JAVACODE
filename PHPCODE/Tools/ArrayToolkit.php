<?php

class ArrayToolkit
{
	// 二维数组返回$columnName一维数组
	public static function column(array $array, $columnName)
	{
		if (empty($array)) {
			return array();
		}
		
		$column = array();
		foreach ($array as $item) {
            if (isset($item[$columnName])) {
                $column[] = $item[$columnName];
            }
		}

        return $column;
	}

	// 一维数组返回指定keys一维数组
	public static function parts(array $array, array $keys)
	{
		foreach (array_keys($array) as $key) {
			if (!in_array($key, $keys)) {
				unset($array[$key]);
			}
		}
		return $array;
	}

	// 一维数组判断是否存在指定keys
	public static function requireds(array $array, array $keys)
	{
		foreach ($keys as $key) {
			if (!array_key_exists($key, $array)) {
				return false;
			}
		}
		return true;
	}

	// 对比一个数组属性值得改变并返回
	public static function changes(array $before, array $after)
	{
		$changes = array('before' => array(), 'after' => array());
		foreach ($after as $key => $value) {
			if (!isset($before[$key])) {
				continue;
			}
			if ($value != $before[$key]) {
				$changes['before'][$key] = $before[$key];
				$changes['after'][$key] = $value;
			}
		}
		return $changes;
	}

    // 将二维数组中的key对应的值作为数组的key
    public static function index (array $array, $name)
    {
        $indexedArray = array();
        if (empty($array)) {
            return $indexedArray;
        }
        
        foreach ($array as $item) {
            if (isset($item[$name])) {
                $indexedArray[$item[$name]] = $item;
                continue;
            }
        }
        return $indexedArray;
    }

}


